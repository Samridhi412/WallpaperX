package com.example.personalizednotesapp.Listeners;

import com.example.personalizednotesapp.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
