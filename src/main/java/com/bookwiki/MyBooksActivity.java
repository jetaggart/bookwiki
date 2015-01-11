package com.bookwiki;

import android.os.Bundle;

public class MyBooksActivity extends LoginRequiredActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        setContentView(R.layout.main);

        super.onCreate(savedInstanceState);
    }
}
