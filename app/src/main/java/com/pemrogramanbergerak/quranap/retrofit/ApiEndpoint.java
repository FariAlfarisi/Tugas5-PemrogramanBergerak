package com.pemrogramanbergerak.quranap.retrofit;

import com.pemrogramanbergerak.quranap.ModelAyat.Ayat;
import com.pemrogramanbergerak.quranap.ModelSurah.Chapters;
import ModelTerjemahan.Terjemahan;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpoint {
    @GET("chapters?language=id")
    Call<Chapters> getSurah();

    @GET("quran/verses/uthmani")
    Call<Ayat> getAyat(@Query("chapter_number") int id);
    @GET("quran/translations/33")
    Call<Terjemahan> getTerjemahan(@Query("translation_id") int translation_id);

}
