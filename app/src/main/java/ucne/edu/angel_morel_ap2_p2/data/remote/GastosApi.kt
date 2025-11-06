package ucne.edu.angel_morel_ap2_p2.data.remote

import retrofit2.Response
import retrofit2.http.*
import ucne.edu.angel_morel_ap2_p2.data.remote.dto.GastoDto

interface GastosApi {
    @GET("api/Gastos")
    suspend fun getGastos(): Response<List<GastoDto>>

    @GET("api/Gastos/{id}")
    suspend fun getGasto(@Path("id") id: Int): Response<GastoDto>

    @POST("api/Gastos")
    suspend fun createGasto(@Body gasto: GastoDto): Response<GastoDto>

    @PUT("api/Gastos/{id}")
    suspend fun updateGasto(@Path("id") id: Int, @Body gasto: GastoDto): Response<Unit>

    @DELETE("api/Gastos/{id}")
    suspend fun deleteGasto(@Path("id") id: Int): Response<Unit>
}