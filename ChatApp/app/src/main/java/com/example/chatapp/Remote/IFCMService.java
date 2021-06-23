package com.example.chatapp.Remote;

import com.example.chatapp.model.FCMResponse;
import com.example.chatapp.model.FCMSendData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
   @Headers({
      "Content-Type:application/json",
           "Authorization:key=AAAACLPSCJw:APA91bG1mMn0WOp5dLv3SFNYIzsIbaNpEpxiNFPCSJmLuhms8FdeV2rwFYG0WC17AoVv3SVkVbjRH7EQDX2CCYEZ4znASeXtx6EI7l0bDAKc-njfFg6pUVl_rNbFuGHkfq8ldLk1p3I6"
   })
   @POST ("fcm/send")

   Observable<FCMResponse> sendNotification(@Body FCMSendData body);
}
