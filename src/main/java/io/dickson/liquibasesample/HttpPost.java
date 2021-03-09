package io.dickson.liquibasesample;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
/*import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;*/

/**
* @author kumara
*
*/
public class HttpPost {
	

	/*
	 * String uploadFile(String url, File file) throws IOException { HttpPost post =
	 * new HttpPost(url); post.setHeader("Accept", "application/json");
	 * _addAuthHeader(post); MultipartEntityBuilder builder =
	 * MultipartEntityBuilder.create(); // fileParamName should be replaced with
	 * parameter name your REST API expect. builder.addPart("fileParamName", new
	 * FileBody(file)); //builder.addPart("optionalParam", new StringBody("true",
	 * ContentType.create("text/plain", Consts.ASCII)));
	 * post.setEntity(builder.build()); HttpResponse response =
	 * getClient().execute(post);; int httpStatus =
	 * response.getStatusLine().getStatusCode(); String responseMsg =
	 * EntityUtils.toString(response.getEntity(), "UTF-8");
	 * 
	 * // If the returned HTTP response code is not in 200 series then // throw the
	 * error if (httpStatus < 200 || httpStatus > 300) { throw new
	 * IOException("HTTP " + httpStatus + " - Error during upload of file: " +
	 * responseMsg); }
	 * 
	 * return responseMsg; }
	 */
}