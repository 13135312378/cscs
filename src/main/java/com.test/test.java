package com.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.junit.Test;

public class test {
    @Test
    public void test(){
       // System.out.println("one twow one");
       // System.out.println("ono on");
        MongoClient MongoClient=new MongoClient("127.0.01",27017);
        System.out.println("cs");
        MongoDatabase ures = MongoClient.getDatabase("user");
        MongoCollection<Document> tb_ures = ures.getCollection("tb_user");

      //增加
      //  Document Document=new Document().append("_id",5).append("name","yoyo");
        // tb_ures.insertOne(Document);

        //修改
      //  Document Document=new Document("$set",new Document().append("name","琴"));
     // tb_ures.updateOne(Filters.eq("_id",5),Document);


       // 删除
        tb_ures.deleteOne(Filters.eq("_id",5));

    //查
        FindIterable<Document> documents = tb_ures.find();
        for (Document document : documents) {
            System.out.println(document.toJson());
        }


    }
}
