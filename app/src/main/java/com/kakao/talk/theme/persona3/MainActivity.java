package com.kakao.talk.theme.persona3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("kakaotalk://settings/theme"));
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(
                this,
                "카카오톡 > 더보기 > 설정 > 테마에서 'Persona 3 - Dark Hour'을 적용해 주세요.",
                Toast.LENGTH_LONG
            ).show();
        }
        finish();
    }
}
