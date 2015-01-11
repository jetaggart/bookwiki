package com.bookwiki;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MyBooksActivity extends LoginRequiredActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        setContentView(R.layout.my_books_activity);

        super.onCreate(savedInstanceState);
    }

    public void searchBooks(View view) {
        Intent intent = new Intent(this, BookSearchActivity.class);
        startActivity(intent);
    }
}
