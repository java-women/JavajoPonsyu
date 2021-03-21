/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package javajo.ponsyukey.controller;

import javajo.ponsyukey.model.CreateReview;
import javajo.ponsyukey.model.DeleteReview;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-21T17:13:17.318949100+09:00[Asia/Tokyo]")
@Validated
@Api(value = "review", description = "the review API")
public interface ReviewApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /review : 口コミ情報登録API
     *
     * @param createReview 口コミ情報登録に必要な情報 (required)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "口コミ情報登録API", nickname = "createReview", notes = "", response = Object.class, tags={ "review", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = Object.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @PostMapping(
        value = "/review",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> createReview(@ApiParam(value = "口コミ情報登録に必要な情報" ,required=true )  @Valid @RequestBody CreateReview createReview) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /review/{reviewId} : 口コミ情報削除API
     *
     * @param reviewId  (required)
     * @param deleteReview 口コミ情報削除に必要な情報 (required)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "口コミ情報削除API", nickname = "deleteReview", notes = "", response = Object.class, tags={ "review", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = Object.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @PostMapping(
        value = "/review/{reviewId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> deleteReview(@ApiParam(value = "",required=true) @PathVariable("reviewId") String reviewId,@ApiParam(value = "口コミ情報削除に必要な情報" ,required=true )  @Valid @RequestBody DeleteReview deleteReview) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /review : 口コミ情報取得API.
     * 必ず日付順（降順）でソートされる
     *
     * @param limit  (required)
     * @param offset  (required)
     * @param sakeId  (optional)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "口コミ情報取得API.", nickname = "getReview", notes = "必ず日付順（降順）でソートされる", response = Object.class, tags={ "review", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = Object.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @GetMapping(
        value = "/review",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> getReview(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "offset", required = true) Integer offset,@ApiParam(value = "") @Valid @RequestParam(value = "sakeId", required = false) String sakeId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
