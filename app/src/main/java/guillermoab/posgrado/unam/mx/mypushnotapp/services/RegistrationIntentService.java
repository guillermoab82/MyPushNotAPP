package guillermoab.posgrado.unam.mx.mypushnotapp.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GcmPubSub;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import guillermoab.posgrado.unam.mx.mypushnotapp.R;


/**
 * Created by GuillermoAB on 12/09/2016.
 */
public class RegistrationIntentService extends IntentService {
    public RegistrationIntentService() {
        super("RegistrationIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try{
            InstanceID instanceID = InstanceID.getInstance(this);
            String registrationToken = instanceID.getToken(getString(R.string.gcm_defaultSenderId), GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
            GcmPubSub subscription = GcmPubSub.getInstance(this);
            subscription.subscribe(registrationToken,"/topics/MyEvents",null);
            Log.d("RegistrationToken",registrationToken);
        }catch(Exception e){
         Log.d("RegistrationToken","FAILED: ",e);
        }
    }
}
