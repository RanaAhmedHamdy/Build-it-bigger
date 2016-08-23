package com.bigr.joketellerproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button tellJoke;
    //private JokeTeller jokeTeller;
    private String joke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);

        //jokeTeller = new JokeTeller();
        //joke = jokeTeller.tellJoke();
        tellJoke = (Button) root.findViewById(R.id.tell_joke_btn);
        tellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(getActivity(), joke, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), JokeViewer.class);
                intent.putExtra("joke", joke);
                startActivity(intent);*/

                new EndpointsAsyncTask().execute(new Pair<Context, String>(getActivity(), "Manfred"));
            }
        });

        return root;
    }
}
