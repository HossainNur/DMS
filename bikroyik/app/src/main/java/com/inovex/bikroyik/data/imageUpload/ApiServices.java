package com.inovex.bikroyik.data.imageUpload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiServices {
    @Multipart
    @POST("client-image")
//    Call<ResponseApiModel> uploadImage (@Part List<MultipartBody.Part> images);
    Call<ResponseApiModel> uploadImage (@Part MultipartBody.Part image);
}
