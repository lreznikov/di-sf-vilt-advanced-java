package com.di.sf.uml;

import java.net.URL;
import java.util.List;

public class BlogAccount {
    private static int accountCounter;

    private String name;

    private List<BlogEntry> entries;

    private Author[] authors = new Author[5];

    public URL publicUrl;

    public void addEntry(BlogEntry newEntry, Author author) {
    }
}
