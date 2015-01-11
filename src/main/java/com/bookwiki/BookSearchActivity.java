package com.bookwiki;

import android.os.Bundle;

public class BookSearchActivity extends LoginRequiredActivity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        setContentView(R.layout.book_search_activity);

        super.onCreate(savedInstanceState);

        getSupportActionBar().setTitle("Search for Books");
    }

}
