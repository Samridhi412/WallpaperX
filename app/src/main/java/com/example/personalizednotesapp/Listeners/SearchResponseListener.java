package com.example.personalizednotesapp.Listeners;

import com.example.personalizednotesapp.Models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response,String message);
    void onError(String message);
}
