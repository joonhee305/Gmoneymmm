package com.dbteamproject.gmoney;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class RegisterRequest extends StringRequest {

    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL_resi = "http://joonhee305.ivyro.net/Register.php";
    private Map<String, String> map;

    public RegisterRequest(String userID, String userPassword, String userName, String userMp, String userCity, Response.Listener<String> listener, Response.ErrorListener errorListener) {

        super(Method.POST, URL_resi, listener,errorListener);
        RegisterActivity.test.append("1\n");
        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
        map.put("userMp",userMp);
        map.put("userCity",userCity);
        RegisterActivity.test.append("2\n");

    }
    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        RegisterActivity.test.append("3\n");
        return map;
    }
}
