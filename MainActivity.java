package com.example.worldofbooks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddBook = findViewById(R.id.btnAddBook);
        Button btnViewBooks = findViewById(R.id.btnViewBooks);
        Button btnDeleteBook = findViewById(R.id.btnDeleteBook);
        Button btnPublisherDetails = findViewById(R.id.btnPublisherDetails);
        Button btnAuthorDetails = findViewById(R.id.btnAuthorDetails);
        Button btnMemberDetails = findViewById(R.id.btnMemberDetails);

        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddBookActivity.class));
            }
        });

        btnViewBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewBooksActivity.class));
            }
        });

        btnDeleteBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DeleteBookActivity.class));
            }
        });

        btnPublisherDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PublisherDetailsActivity.class));
            }
        });

        btnAuthorDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AuthorDetailsActivity.class));
            }
        });

        btnMemberDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MemberDetailsActivity.class));
            }
        });
    }
}

