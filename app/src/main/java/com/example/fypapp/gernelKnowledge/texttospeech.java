package com.example.fypapp.gernelKnowledge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Toast;

import com.example.fypapp.R;

import java.util.Locale;

public class texttospeech extends AppCompatActivity {
    TextToSpeech textToSpeech;
    String text;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texttospeech);
        textToSpeech = new TextToSpeech(texttospeech.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i == TextToSpeech.SUCCESS) {
                    result = textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();
                }

            }
        });
//////
    }
    public void tts(View view)
    {
        switch (view.getId()) {
            case R.id.speechid:
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                } else {
                    textToSpeech.speak("a for apple", TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.bid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("b for ball",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.cid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("C for Cat",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.did:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("D for Dog",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.eid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("e for egg",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.fid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("f for Fish",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.gid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("g for goat",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.hid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("h for hen",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.iid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("i for ice cream",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.jid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("j for jug",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.kid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("k for kite",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.lid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("l for lion",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.mid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("m for monkey",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.nid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("n for nest",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.oid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("o for orange",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.pid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("p for panda",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.qid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("q for queen",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.rid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("r for rabbit",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.sid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("s for snake",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.tid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("t for tiger",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.uid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("u for umbralla",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }

            case R.id.vid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("v for vampir",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.wid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("w for watch",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.xid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("x  for xylophone",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.yid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("y for yoga",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
            case R.id.zid:
            {
                if(result==TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(texttospeech.this, "Not Support in your device", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    textToSpeech.speak("z for zabra",TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
            }
        }


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(textToSpeech!=null)
        {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }


}
