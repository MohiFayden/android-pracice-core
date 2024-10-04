package com.fadenai.androidsample1.data.network

import com.fadenai.androidsample1.data.network.jsonmodels.AuthResponseJM
import com.fadenai.androidsample1.data.network.jsonmodels.CourseJM
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap
import retrofit2.http.Url

interface NetworkAPI {

    /**
     * Get course_list with coroutine
     */
    @GET("course_list")
    suspend fun getCourseList(): List<CourseJM>

    /**
     * Get paginated course_list
     */
    @GET("course_list")
    suspend fun getPaginatedCourseList(
        @Query("page") page: Int,
        @Query("size") size: Int
    ): List<CourseJM>

    /**
     * get course_list with auth_token header
     * This header can be added to the Okhttp builder as part of the default data
     */
    @GET("course_list")
    suspend fun courseListWithAuthHeader(
        @Header("auth_token") authToken: String
    ): List<CourseJM>

    /**
     * Get course_list with number of filters
     *
     * Use a @QueryMap for greater flexibility in queries. This allows adding optional parameters at runtime, making it more dynamic.
     */

    @GET("course_list")
    suspend fun getFilteredCourses(
        @QueryMap filters: Map<String, String>
    ): List<CourseJM>

    /**
     * Create new_course
     */
    @POST("new_course")
    suspend fun postCourse(
        @Body course: CourseJM
    ): CourseJM

    /**
     * upload_course_image
     */
    @Multipart
    @POST("upload_course_image")
    suspend fun uploadCourseImage(
        @Part("course_id") courseId: Int,
        @Part image: MultipartBody.Part
    ): CourseJM

    /**
     * update_course with course_id path and rate query
     */
    @PUT("update_course/{course_id}")
    suspend fun updateCourseRate(
        @Path("course_id") courseId: Int,
        @Query("rate") rate: Int
    ): CourseJM

    /**
     * delete a course by course_id query
     */
    @DELETE("course")
    suspend fun deleteCourseQuery(
        @Query("course_id") courseId: Int
    ): CourseJM

    /**
     * Partial course_update: update_course
     */
    @PATCH("course_update/{course_id}")
    suspend fun patchCourse(
        @Path("course_id") courseId: Int,
        @Body partialCourseUpdate: Map<String, Any>
    ): CourseJM

    /**
     * Form url for course_auth with username and password:
     *
     * @FormUrlEncoded: This annotation is used to indicate that the request body will be sent using form URL encoding.
     * Form URL encoding means the data will be encoded as key-value pairs,
     * similar to how data is submitted using HTML forms (e.g., username=user1&password=pass123).
     * It is commonly used for APIs that require data submission in a compact format suitable for
     * simple form-like data submissions, such as login credentials or small input forms.
     *
     * @Field: The @Field annotation is used to specify individual form fields that will be included in the request body.
     * Each @Field corresponds to a key-value pair in the URL-encoded form.
     * In this example, @Field("username") and @Field("password") specify the fields that will be sent
     * as part of the encoded form, with the values provided by the function arguments.
     */
    @FormUrlEncoded
    @POST("course_auth")
    suspend fun authenticateCourse(
        @Field("username") username: String,
        @Field("password") password: String
    ): AuthResponseJM

    /**
     * Get from dynamic url
     */
    @GET
    suspend fun getFromDynamicUrl(
        @Url url: String
    ): List<CourseJM>

    //-------Handling Different Response Types--------

    /**
     * Get course_list with Flow
     */
    @GET("course_list")
    fun getCourseListFlow(): Flow<List<CourseJM>>

    /**
     * Get course_list with RX Observable (Or Single)
     */
    @GET("course_list")
    fun getCourseListObservable(): Observable<List<CourseJM>>

    /**
     * Get course_list with Retrofit Call
     */
    @GET("course_list")
    fun getCourseListRetrofitCall(): Response<List<CourseJM>>
}