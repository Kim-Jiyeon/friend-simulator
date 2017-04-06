package kr.hs.emirim.gjy00727.friend_simulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG="김효린:Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        Log.d(TAG, "activity_main 레이아웃 세팅~");
    }

    void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this, "졸려", Toast.LENGTH_SHORT);
                break;
            case R.id.button2:
                Toast.makeText(this, "효린이 메렁", Toast.LENGTH_SHORT);
                break;
            case R.id.button3:
                Toast.makeText(this, "효린이 바부", Toast.LENGTH_SHORT);
                break;
            case R.id.button4:
                Toast.makeText(this, "효린이 자바 10번 쓰기", Toast.LENGTH_SHORT);
                break;
            case R.id.button5:
                Toast.makeText(this, "효린이 멍청이", Toast.LENGTH_SHORT);
                break;
        }
    }
}
