/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-06T19:57:05.280503900+02:00[Europe/Berlin]")
@Validated
@Tag(name = "Folders", description = "the Folders API")
public interface FoldersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /folders/{folder_id}/items : List items in folder
     * Retrieves a page of items in a folder. These items can be files, folders, and web links.  To request more information about the folder itself, like its size, please use the [Get a folder](#get-folders-id) endpoint instead.
     *
     * @param folderId The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL &#x60;https://_*.app.box.com/folder/123&#x60; the &#x60;folder_id&#x60; is &#x60;123&#x60;.  The root folder of a Box account is always represented by the ID &#x60;0&#x60;. (required)
     * @param fields A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the &#x60;metadata&#x60; field as well as the scope and key of the template to retrieve, for example &#x60;?field&#x3D;metadata.enterprise_12345.contractTemplate&#x60;. (optional)
     * @param usemarker Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a &#x60;marker&#x60; field that can be passed as a parameter to this endpoint to get the next page of the response. (optional)
     * @param marker Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires &#x60;usemarker&#x60; to be set to &#x60;true&#x60;. (optional)
     * @param offset The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response. (optional, default to 0)
     * @param limit The maximum number of items to return per page. (optional)
     * @param boxapi The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format &#x60;shared_link&#x3D;[link]&#x60; or if a password is required then use &#x60;shared_link&#x3D;[link]&amp;shared_link_password&#x3D;[password]&#x60;.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item. (optional)
     * @param sort Defines the **second** attribute by which items are sorted.  Items are always sorted by their &#x60;type&#x60; first, with folders listed before files, and files listed before web links.  This parameter is not supported for marker-based pagination on the root folder (the folder with an ID of &#x60;0&#x60;). (optional)
     * @param direction The direction to sort results in. This can be either in alphabetical ascending (&#x60;ASC&#x60;) or descending (&#x60;DESC&#x60;) order. (optional)
     * @return Returns a collection of files, folders, and web links contained in a folder. (status code 200)
     *         or Returned when the access token provided in the &#x60;Authorization&#x60; header is not recognized or not provided. (status code 403)
     *         or Returned if the folder is not found, or the user does not have access to the folder. (status code 404)
     *         or Returned if the &#x60;folder_id&#x60; is not in a recognized format. (status code 405)
     *         or An unexpected client error. (status code 200)
     */
    @Operation(
        operationId = "getFoldersIdItems",
        summary = "List items in folder",
        description = "Retrieves a page of items in a folder. These items can be files, folders, and web links.  To request more information about the folder itself, like its size, please use the [Get a folder](#get-folders-id) endpoint instead.",
        tags = { "Folders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Returns a collection of files, folders, and web links contained in a folder."),
            @ApiResponse(responseCode = "403", description = "Returned when the access token provided in the `Authorization` header is not recognized or not provided."),
            @ApiResponse(responseCode = "404", description = "Returned if the folder is not found, or the user does not have access to the folder."),
            @ApiResponse(responseCode = "405", description = "Returned if the `folder_id` is not in a recognized format."),
            @ApiResponse(responseCode = "default", description = "An unexpected client error.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/folders/{folder_id}/items"
    )
    default ResponseEntity<Void> getFoldersIdItems(
        @Parameter(name = "folder_id", description = "The unique identifier that represent a folder.  The ID for any folder can be determined by visiting this folder in the web application and copying the ID from the URL. For example, for the URL `https://_*.app.box.com/folder/123` the `folder_id` is `123`.  The root folder of a Box account is always represented by the ID `0`.", required = true, in = ParameterIn.PATH) @PathVariable("folder_id") String folderId,
        @Parameter(name = "fields", description = "A comma-separated list of attributes to include in the response. This can be used to request fields that are not normally returned in a standard response.  Be aware that specifying this parameter will have the effect that none of the standard fields are returned in the response unless explicitly specified, instead only fields for the mini representation are returned, additional to the fields requested.  Additionally this field can be used to query any metadata applied to the file by specifying the `metadata` field as well as the scope and key of the template to retrieve, for example `?field=metadata.enterprise_12345.contractTemplate`.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "fields", required = false) List<String> fields,
        @Parameter(name = "usemarker", description = "Specifies whether to use marker-based pagination instead of offset-based pagination. Only one pagination method can be used at a time.  By setting this value to true, the API will return a `marker` field that can be passed as a parameter to this endpoint to get the next page of the response.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "usemarker", required = false) Boolean usemarker,
        @Parameter(name = "marker", description = "Defines the position marker at which to begin returning results. This is used when paginating using marker-based pagination.  This requires `usemarker` to be set to `true`.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "marker", required = false) String marker,
        @Parameter(name = "offset", description = "The offset of the item at which to begin the response.  Queries with offset parameter value exceeding 10000 will be rejected with a 400 response.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Long offset,
        @Max(1000L) @Parameter(name = "limit", description = "The maximum number of items to return per page.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Long limit,
        @Parameter(name = "boxapi", description = "The URL, and optional password, for the shared link of this item.  This header can be used to access items that have not been explicitly shared with a user.  Use the format `shared_link=[link]` or if a password is required then use `shared_link=[link]&shared_link_password=[password]`.  This header can be used on the file or folder shared, as well as on any files or folders nested within the item.", in = ParameterIn.HEADER) @RequestHeader(value = "boxapi", required = false) String boxapi,
        @Parameter(name = "sort", description = "Defines the **second** attribute by which items are sorted.  Items are always sorted by their `type` first, with folders listed before files, and files listed before web links.  This parameter is not supported for marker-based pagination on the root folder (the folder with an ID of `0`).", in = ParameterIn.QUERY) @Valid @RequestParam(value = "sort", required = false) String sort,
        @Parameter(name = "direction", description = "The direction to sort results in. This can be either in alphabetical ascending (`ASC`) or descending (`DESC`) order.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "direction", required = false) String direction
    ) {

        //Start Time:
        //End Time:

        //Add validation code here


        //

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
