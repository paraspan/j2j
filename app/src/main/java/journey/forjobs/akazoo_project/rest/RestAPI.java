package journey.forjobs.akazoo_project.rest;

import journey.forjobs.akazoo_project.rest.pojos.GetPlaylistsResponse;
import journey.forjobs.akazoo_project.rest.pojos.GetTracksResponse;
import retrofit.http.GET;
import retrofit.http.Query;

public interface RestAPI {

    @GET("/TestMobileService.svc/playlists")
    void getPlaylists(RestCallback<GetPlaylistsResponse> callback);

    @GET("/TestMobileService.svc/playlist")
    void getTracks(@Query("playlistid") String playlistid, RestCallback<GetTracksResponse> callback);

}