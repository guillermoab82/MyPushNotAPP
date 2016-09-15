package guillermoab.posgrado.unam.mx.mypushnotapp.services;

import android.app.IntentService;
import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by GuillermoAB on 12/09/2016.
 */
public class TokenRefreshListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh(){
        Intent intent=new Intent(this,RegistrationIntentService.class);
        startService(intent);
    }
}
