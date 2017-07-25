package com.poc.mongodbredisintegration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.poc.mongodbredisintegration.controller.MongoDBRedisIntegrationController;
import com.poc.mongodbredisintegration.document.Book;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MongoDBRedisIntegrationApplicationTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoDBRedisIntegrationController controller;

    @Test
    public void contextLoads() {
        assertThat(mongoTemplate).isNotNull();
    }

    @Test
    public void insertData() {
        controller.deleteAll();
        Book book = new Book();
        book.setTitle("MongoDbCookBook");
        book.setText("MongoDB Data Book");
        book.setAuthor("Raja");
        Book response = controller.saveBook(book);
        assertThat(response).isNotNull();
        assertThat(response.getId()).isNotBlank();
        assertThat(response.getAuthor()).isEqualTo("Raja");
    }

}
