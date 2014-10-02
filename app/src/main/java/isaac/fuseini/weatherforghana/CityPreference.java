package isaac.fuseini.weatherforghana;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Accra as the default city
    String getCity(){
        return prefs.getString("city", "Accra, GH");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}