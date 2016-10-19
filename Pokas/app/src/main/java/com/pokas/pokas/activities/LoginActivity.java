package com.pokas.pokas.activities;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pokas.pokas.R;

import junit.framework.Assert;

import java.util.Arrays;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;


    /**
     * A dummy deviceIds store.
     * TODO: remove after connecting to a real registration system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "222888ffaa88", "bjlkjlkjl444"
    };


    private EditText mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String android_id = getDeviceId();
        if (isRegistered(android_id)) {
            //tbd open menu
        } else {
            openRegisterPage();
        }
    }

    private void openRegisterPage() {
        setContentView(R.layout.activity_login);
        TextView t = (TextView) findViewById(R.id.textView1);
        // TBD get question
        t.setText("This sentence should be got by API call ...");
        mAnswer = (EditText) findViewById(R.id.answer);
        Button mEmailSignInButton = (Button) findViewById(R.id.register_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "You did not enter an answer", Toast.LENGTH_SHORT).show();
                    return;
                }
                //send request
            }
        });

    }

    private String getDeviceId() {
        return Secure.getString(getContentResolver(),
                Secure.ANDROID_ID);
    }

    private boolean isRegistered(String deviceId) {
        //tbd API request call request
        if (Arrays.asList(DUMMY_CREDENTIALS).contains(deviceId)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Callback received when a permissions request has been completed.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        //TBD open menu

    }

    /**
     * Represents an asynchronous registration task used to authenticate
     * the user.
     */
    public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {


        @Override
        protected Boolean doInBackground(Void... params) {
            // TODO: attempt authentication against a network service.

            try {
                // Simulate network access.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return false;
            }
            String android_id = Secure.getString(getContentResolver(),
                    Secure.ANDROID_ID);
            Assert.assertFalse(isRegistered(android_id));
            Arrays.asList(DUMMY_CREDENTIALS).add(android_id);
            Log.i("DUMMY_CREDENTIALS", String.valueOf(DUMMY_CREDENTIALS.length));
            // TODO: register the new account here.
            return true;
        }

        @Override
        protected void onPostExecute(final Boolean success) {

        }

        @Override
        protected void onCancelled() {
        }
    }
}

