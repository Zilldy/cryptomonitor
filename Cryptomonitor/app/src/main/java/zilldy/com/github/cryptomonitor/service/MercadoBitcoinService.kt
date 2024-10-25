package zilldy.com.github.cryptomonitor.service

import retrofit2.Response
import retrofit2.http.GET
import zilldy.com.github.cryptomonitor.model.TickerResponse

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}