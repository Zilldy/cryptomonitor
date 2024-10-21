package com.github.zilldy.cryptomonitor.service

import com.github.zilldy.cryptomonitor.model.TickerResponse
import okhttp3.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}
