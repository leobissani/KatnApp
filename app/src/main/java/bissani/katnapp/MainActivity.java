package bissani.katnapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private ImageView playNight;
    private ImageView playLightWind;
    private ImageView playHeavyWind;
    private ImageView playLightRain;
    private ImageView playMediumRain;
    private ImageView playHeavyRain;
    private ImageView playThunder;
    private ImageView playForest;
    private ImageView playBirds;
    private ImageView playCities;
    private ImageView playCars;
    private ImageView playFireplace;
    private ImageView playSnowStorm;
    private ImageView playOcean;
    private ImageView playRiver;
    private ImageView playWaterfall;

    private MediaPlayer nightSound;
    private MediaPlayer lightWindSound;
    private MediaPlayer heavyWindSound;
    private MediaPlayer lightRainSound;
    private MediaPlayer mediumRainSound;
    private MediaPlayer heavyRainSound;
    private MediaPlayer thunderSound;
    private MediaPlayer forestSound;
    private MediaPlayer birdsSound;
    private MediaPlayer citiesSound;
    private MediaPlayer carsSound;
    private MediaPlayer fireplaceSound;
    private MediaPlayer snowStormSound;
    private MediaPlayer oceanSound;
    private MediaPlayer riverSound;
    private MediaPlayer waterfallSound;

    private TextView textNight;
    private SeekBar seekBarNight;
    private final static int nightMaxVolume = 10;
    private TextView textLightWind;
    private SeekBar seekBarLightWind;
    private final static int lightWindMaxVolume = 10;
    private TextView textHeavyWind;
    private SeekBar seekBarHeavyWind;
    private final static int heavyWindMaxVolume = 10;
    private TextView textLightRain;
    private SeekBar seekBarLightRain;
    private final static int lightRainMaxVolume = 10;
    private TextView textMediumRain;
    private SeekBar seekBarMediumRain;
    private final static int mediumRainMaxVolume = 10;
    private TextView textHeavyRain;
    private SeekBar seekBarHeavyRain;
    private final static int heavyRainMaxVolume = 10;
    private TextView textThunder;
    private SeekBar seekBarThunder;
    private final static int thunderMaxVolume = 10;
    private TextView textForest;
    private SeekBar seekBarForest;
    private final static int forestMaxVolume = 10;
    private TextView textBirds;
    private SeekBar seekBarBirds;
    private final static int birdsMaxVolume = 10;
    private TextView textCities;
    private SeekBar seekBarCities;
    private final static int citiesMaxVolume = 10;
    private TextView textCars;
    private SeekBar seekBarCars;
    private final static int carsMaxVolume = 10;
    private TextView textFireplace;
    private SeekBar seekBarFireplace;
    private final static int fireplaceMaxVolume = 10;
    private TextView textSnowStorm;
    private SeekBar seekBarSnowStorm;
    private final static int snowStormMaxVolume = 10;
    private TextView textOcean;
    private SeekBar seekBarOcean;
    private final static int oceanMaxVolume = 10;
    private TextView textRiver;
    private SeekBar seekBarRiver;
    private final static int riverMaxVolume = 10;
    private TextView textWaterfall;
    private SeekBar seekBarWaterfall;
    private final static int waterfallMaxVolume = 10;

    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playNight = (ImageView) findViewById(R.id.nightID);
        playLightWind = (ImageView) findViewById(R.id.lightWindID);
        playHeavyWind = (ImageView) findViewById(R.id.heavyWindID);
        playLightRain = (ImageView) findViewById(R.id.lightRainID);
        playMediumRain = (ImageView) findViewById(R.id.mediumRainID);
        playHeavyRain = (ImageView) findViewById(R.id.heavyRainID);
        playThunder = (ImageView) findViewById(R.id.thunderID);
        playForest = (ImageView) findViewById(R.id.forestID);
        playBirds = (ImageView) findViewById(R.id.birdsID);
        playCities = (ImageView) findViewById(R.id.cityID);
        playCars = (ImageView) findViewById(R.id.carsID);
        playFireplace = (ImageView) findViewById(R.id.fireplaceID);
        playSnowStorm = (ImageView) findViewById(R.id.snowStormID);
        playOcean = (ImageView) findViewById(R.id.oceanID);
        playRiver = (ImageView) findViewById(R.id.riverID);
        playWaterfall = (ImageView) findViewById(R.id.waterfallID);

        textNight = (TextView) findViewById(R.id.valueNightID);
        textLightWind = (TextView) findViewById(R.id.valueLightWindID);
        textHeavyWind = (TextView) findViewById(R.id.valueHeavyWindID);
        textLightRain = (TextView) findViewById(R.id.valueLightRainID);
        textMediumRain = (TextView) findViewById(R.id.valueMediumRainID);
        textHeavyRain = (TextView) findViewById(R.id.valueHeavyRainID);
        textThunder = (TextView) findViewById(R.id.valueThunderID);
        textForest = (TextView) findViewById(R.id.valueForestID);
        textBirds = (TextView) findViewById(R.id.valueBirdsID);
        textCities = (TextView) findViewById(R.id.valueCityID);
        textCars = (TextView) findViewById(R.id.valueCarsID);
        textFireplace = (TextView) findViewById(R.id.valueFireplaceID);
        textSnowStorm = (TextView) findViewById(R.id.valueSnowStormID);
        textOcean = (TextView) findViewById(R.id.valueOceanID);
        textRiver = (TextView) findViewById(R.id.valueRiverID);
        textWaterfall = (TextView) findViewById(R.id.valueWaterfallID);

        nightSound = MediaPlayer.create(MainActivity.this, R.raw.nightsound);
        lightWindSound = MediaPlayer.create(MainActivity.this, R.raw.lightwindsound);
        heavyWindSound = MediaPlayer.create(MainActivity.this, R.raw.heavywindsound);
        lightRainSound = MediaPlayer.create(MainActivity.this, R.raw.lightrainsound);
        mediumRainSound = MediaPlayer.create(MainActivity.this, R.raw.mediumrainsound);
        heavyRainSound = MediaPlayer.create(MainActivity.this, R.raw.heavyrainsound);
        thunderSound = MediaPlayer.create(MainActivity.this, R.raw.thundersound);
        forestSound = MediaPlayer.create(MainActivity.this, R.raw.forestsound);
        birdsSound = MediaPlayer.create(MainActivity.this, R.raw.birdssound);
        citiesSound = MediaPlayer.create(MainActivity.this, R.raw.citiessound);
        carsSound = MediaPlayer.create(MainActivity.this, R.raw.carssound);
        fireplaceSound = MediaPlayer.create(MainActivity.this, R.raw.fireplacesound);
        snowStormSound = MediaPlayer.create(MainActivity.this, R.raw.snowstormsound);
        oceanSound = MediaPlayer.create(MainActivity.this, R.raw.oceansound);
        riverSound = MediaPlayer.create(MainActivity.this, R.raw.riversound);
        waterfallSound = MediaPlayer.create(MainActivity.this, R.raw.waterfallsound);

        initNightControls();
        initLightWindControls();
        initHeavyWindControls();
        initLightRainControls();
        initMediumRainControls();
        initHeavyRainControls();
        initThunderControls();
        initForestControls();
        initBirdsControls();
        initCitiesControls();
        initCarsControls();
        initFireplaceControls();
        initSnowStormControls();
        initOceanControls();
        initRiverControls();
        initWaterfallControls();

        playNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nightSound.isPlaying()) {
                    pauseNightSound();
                }
                else {
                    playNightSound();
                }
            }
        });

        playLightWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lightWindSound.isPlaying()) {
                    pauseLightWindSound();
                }
                else {
                    playLightWindSound();
                }
            }
        });

        playHeavyWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(heavyWindSound.isPlaying()) {
                    pauseHeavyWindSound();
                }
                else {
                    playHeavyWindSound();
                }
            }
        });

        playLightRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lightRainSound.isPlaying()) {
                    pauseLightRainSound();
                }
                else {
                    playLightRainSound();
                }
            }
        });

        playMediumRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediumRainSound.isPlaying()) {
                    pauseMediumRainSound();
                }
                else {
                    playMediumRainSound();
                }
            }
        });

        playHeavyRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(heavyRainSound.isPlaying()) {
                    pauseHeavyRainSound();
                }
                else {
                    playHeavyRainSound();
                }
            }
        });

        playThunder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thunderSound.isPlaying()) {
                    pauseThunderSound();
                }
                else {
                    playThunderSound();
                }
            }
        });

        playForest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(forestSound.isPlaying()) {
                    pauseForestSound();
                }
                else {
                    playForestSound();
                }
            }
        });

        playBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(birdsSound.isPlaying()) {
                    pauseBirdsSound();
                }
                else {
                    playBirdsSound();
                }
            }
        });

        playCities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(citiesSound.isPlaying()) {
                    pauseCitiesSound();
                }
                else {
                    playCitiesSound();
                }
            }
        });

        playCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(carsSound.isPlaying()) {
                    pauseCarsSound();
                }
                else {
                    playCarsSound();
                }
            }
        });

        playFireplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fireplaceSound.isPlaying()) {
                    pauseFireplaceSound();
                }
                else {
                    playFireplaceSound();
                }
            }
        });

        playSnowStorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(snowStormSound.isPlaying()) {
                    pauseSnowStormSound();
                }
                else {
                    playSnowStormSound();
                }
            }
        });

        playOcean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oceanSound.isPlaying()) {
                    pauseOceanSound();
                }
                else {
                    playOceanSound();
                }
            }
        });

        playRiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(riverSound.isPlaying()) {
                    pauseRiverSound();
                }
                else {
                    playRiverSound();
                }
            }
        });

        playWaterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(waterfallSound.isPlaying()) {
                    pauseWaterfallSound();
                }
                else {
                    playWaterfallSound();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.about:
                Intent intent = new Intent(MainActivity.this, ActivityAbout.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void initNightControls() {
        try {
            seekBarNight = (SeekBar) findViewById(R.id.barNightID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarNight.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarNight.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarNight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(nightMaxVolume - progress) / Math.log(nightMaxVolume)));
                    nightSound.setVolume(volume, volume);
                    textNight.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initLightWindControls() {
        try {
            seekBarLightWind = (SeekBar) findViewById(R.id.barLightWindID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarLightWind.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarLightWind.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarLightWind.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(lightWindMaxVolume - progress) / Math.log(lightWindMaxVolume)));
                    lightWindSound.setVolume(volume, volume);
                    textLightWind.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initHeavyWindControls() {
        try {
            seekBarHeavyWind = (SeekBar) findViewById(R.id.barHeavyWindID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarHeavyWind.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarHeavyWind.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarHeavyWind.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(heavyWindMaxVolume - progress) / Math.log(heavyWindMaxVolume)));
                    heavyWindSound.setVolume(volume, volume);
                    textHeavyWind.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initLightRainControls() {
        try {
            seekBarLightRain = (SeekBar) findViewById(R.id.barLightRainID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarLightRain.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarLightRain.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarLightRain.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(lightWindMaxVolume - progress) / Math.log(lightRainMaxVolume)));
                    lightRainSound.setVolume(volume, volume);
                    textLightRain.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initMediumRainControls() {
        try {
            seekBarMediumRain = (SeekBar) findViewById(R.id.barMediumRainID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarMediumRain.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarMediumRain.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarMediumRain.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(mediumRainMaxVolume - progress) / Math.log(mediumRainMaxVolume)));
                    mediumRainSound.setVolume(volume, volume);
                    textMediumRain.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initHeavyRainControls() {
        try {
            seekBarHeavyRain = (SeekBar) findViewById(R.id.barHeavyRainID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarHeavyRain.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarHeavyRain.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarHeavyRain.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(heavyRainMaxVolume - progress) / Math.log(heavyRainMaxVolume)));
                    heavyRainSound.setVolume(volume, volume);
                    textHeavyRain.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initThunderControls() {
        try {
            seekBarThunder = (SeekBar) findViewById(R.id.barThunderID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarThunder.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarThunder.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarThunder.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(thunderMaxVolume - progress) / Math.log(thunderMaxVolume)));
                    thunderSound.setVolume(volume, volume);
                    textThunder.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initForestControls() {
        try {
            seekBarForest = (SeekBar) findViewById(R.id.barForestID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarForest.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarForest.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarForest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(forestMaxVolume - progress) / Math.log(forestMaxVolume)));
                    forestSound.setVolume(volume, volume);
                    textForest.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initBirdsControls() {
        try {
            seekBarBirds = (SeekBar) findViewById(R.id.barBirdsID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarBirds.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarBirds.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarBirds.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(birdsMaxVolume - progress) / Math.log(birdsMaxVolume)));
                    birdsSound.setVolume(volume, volume);
                    textBirds.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initCitiesControls() {
        try {
            seekBarCities = (SeekBar) findViewById(R.id.barCityID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarCities.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarCities.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarCities.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(citiesMaxVolume - progress) / Math.log(citiesMaxVolume)));
                    citiesSound.setVolume(volume, volume);
                    textCities.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initCarsControls() {
        try {
            seekBarCars = (SeekBar) findViewById(R.id.barCarsID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarCars.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarCars.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarCars.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(carsMaxVolume - progress) / Math.log(carsMaxVolume)));
                    carsSound.setVolume(volume, volume);
                    textCars.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initFireplaceControls() {
        try {
            seekBarFireplace = (SeekBar) findViewById(R.id.barFireplaceID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarFireplace.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarFireplace.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarFireplace.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(fireplaceMaxVolume - progress) / Math.log(fireplaceMaxVolume)));
                    fireplaceSound.setVolume(volume, volume);
                    textFireplace.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initSnowStormControls() {
        try {
            seekBarSnowStorm = (SeekBar) findViewById(R.id.barSnowStormID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarSnowStorm.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarSnowStorm.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarSnowStorm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(snowStormMaxVolume - progress) / Math.log(snowStormMaxVolume)));
                    snowStormSound.setVolume(volume, volume);
                    textSnowStorm.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initOceanControls() {
        try {
            seekBarOcean = (SeekBar) findViewById(R.id.barOceanID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarOcean.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarOcean.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarOcean.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(oceanMaxVolume - progress) / Math.log(oceanMaxVolume)));
                    oceanSound.setVolume(volume, volume);
                    textOcean.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initRiverControls() {
        try {
            seekBarRiver = (SeekBar) findViewById(R.id.barRiverID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarRiver.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarRiver.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarRiver.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(riverMaxVolume - progress) / Math.log(riverMaxVolume)));
                    riverSound.setVolume(volume, volume);
                    textRiver.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initWaterfallControls() {
        try {
            seekBarWaterfall = (SeekBar) findViewById(R.id.barWaterfallID);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

            seekBarWaterfall.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            seekBarWaterfall.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

            seekBarWaterfall.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    float volume = (float) (1 - (Math.log(waterfallMaxVolume - progress) / Math.log(waterfallMaxVolume)));
                    waterfallSound.setVolume(volume, volume);
                    textWaterfall.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playNightSound() {
        if(nightSound != null) {
            nightSound.start();
            nightSound.setLooping(true);
            playNight.setImageResource(R.drawable.nighton);
        }
    }

    private void pauseNightSound() {
        if(nightSound != null) {
            nightSound.pause();
            playNight.setImageResource(R.drawable.nightoff);
        }
    }

    private void playLightWindSound() {
        if(lightWindSound != null) {
            lightWindSound.start();
            lightWindSound.setLooping(true);
            playLightWind.setImageResource(R.drawable.lightwindon);
        }
    }

    private void pauseLightWindSound() {
        if(lightWindSound != null) {
            lightWindSound.pause();
            playLightWind.setImageResource(R.drawable.lightwindoff);
        }
    }

    private void playHeavyWindSound() {
        if(heavyWindSound != null) {
            heavyWindSound.start();
            heavyWindSound.setLooping(true);
            playHeavyWind.setImageResource(R.drawable.heavywindon);
        }
    }

    private void pauseHeavyWindSound() {
        if(heavyWindSound != null) {
            heavyWindSound.pause();
            playHeavyWind.setImageResource(R.drawable.heavywindoff);
        }
    }

    private void playLightRainSound() {
        if(lightRainSound != null) {
            lightRainSound.start();
            lightRainSound.setLooping(true);
            playLightRain.setImageResource(R.drawable.lightrainon);
        }
    }

    private void pauseLightRainSound() {
        if(lightRainSound != null) {
            lightRainSound.pause();
            playLightRain.setImageResource(R.drawable.lightrainoff);
        }
    }

    private void playMediumRainSound() {
        if(mediumRainSound != null) {
            mediumRainSound.start();
            mediumRainSound.setLooping(true);
            playMediumRain.setImageResource(R.drawable.mediumrainon);
        }
    }

    private void pauseMediumRainSound() {
        if(mediumRainSound != null) {
            mediumRainSound.pause();
            playMediumRain.setImageResource(R.drawable.mediumrainoff);
        }
    }

    private void playHeavyRainSound() {
        if(heavyRainSound != null) {
            heavyRainSound.start();
            heavyRainSound.setLooping(true);
            playHeavyRain.setImageResource(R.drawable.heavyrainon);
        }
    }

    private void pauseHeavyRainSound() {
        if(heavyRainSound != null) {
            heavyRainSound.pause();
            playHeavyRain.setImageResource(R.drawable.heavyrainoff);
        }
    }

    private void playThunderSound() {
        if(thunderSound != null) {
            thunderSound.start();
            thunderSound.setLooping(true);
            playThunder.setImageResource(R.drawable.thunderon);
        }
    }

    private void pauseThunderSound() {
        if(thunderSound != null) {
            thunderSound.pause();
            playThunder.setImageResource(R.drawable.thunderoff);
        }
    }

    private void playForestSound() {
        if(forestSound != null) {
            forestSound.start();
            forestSound.setLooping(true);
            playForest.setImageResource(R.drawable.foreston);
        }
    }

    private void pauseForestSound() {
        if(forestSound != null) {
            forestSound.pause();
            playForest.setImageResource(R.drawable.forestoff);
        }
    }

    private void playBirdsSound() {
        if(birdsSound != null) {
            birdsSound.start();
            birdsSound.setLooping(true);
            playBirds.setImageResource(R.drawable.birdson);
        }
    }

    private void pauseBirdsSound() {
        if(birdsSound != null) {
            birdsSound.pause();
            playBirds.setImageResource(R.drawable.birdsoff);
        }
    }

    private void playCitiesSound() {
        if(citiesSound != null) {
            citiesSound.start();
            citiesSound.setLooping(true);
            playCities.setImageResource(R.drawable.cityon);
        }
    }

    private void pauseCitiesSound() {
        if(citiesSound != null) {
            citiesSound.pause();
            playCities.setImageResource(R.drawable.cityoff);
        }
    }

    private void playCarsSound() {
        if(carsSound != null) {
            carsSound.start();
            carsSound.setLooping(true);
            playCars.setImageResource(R.drawable.carson);
        }
    }

    private void pauseCarsSound() {
        if(carsSound != null) {
            carsSound.pause();
            playCars.setImageResource(R.drawable.carsoff);
        }
    }

    private void playFireplaceSound() {
        if(fireplaceSound != null) {
            fireplaceSound.start();
            fireplaceSound.setLooping(true);
            playFireplace.setImageResource(R.drawable.fireplaceon);
        }
    }

    private void pauseFireplaceSound() {
        if(fireplaceSound != null) {
            fireplaceSound.pause();
            playFireplace.setImageResource(R.drawable.fireplaceoff);
        }
    }

    private void playSnowStormSound() {
        if(snowStormSound != null) {
            snowStormSound.start();
            snowStormSound.setLooping(true);
            playSnowStorm.setImageResource(R.drawable.snowstormon);
        }
    }

    private void pauseSnowStormSound() {
        if(snowStormSound != null) {
            snowStormSound.pause();
            playSnowStorm.setImageResource(R.drawable.snowstormoff);
        }
    }

    private void playOceanSound() {
        if(oceanSound != null) {
            oceanSound.start();
            oceanSound.setLooping(true);
            playOcean.setImageResource(R.drawable.oceanon);
        }
    }

    private void pauseOceanSound() {
        if(oceanSound != null) {
            oceanSound.pause();
            playOcean.setImageResource(R.drawable.oceanoff);
        }
    }

    private void playRiverSound() {
        if(riverSound != null) {
            riverSound.start();
            riverSound.setLooping(true);
            playRiver.setImageResource(R.drawable.riveron);
        }
    }

    private void pauseRiverSound() {
        if(riverSound != null) {
            riverSound.pause();
            playRiver.setImageResource(R.drawable.riveroff);
        }
    }

    private void playWaterfallSound() {
        if(waterfallSound != null) {
            waterfallSound.start();
            waterfallSound.setLooping(true);
            playWaterfall.setImageResource(R.drawable.waterfallon);
        }
    }

    private void pauseWaterfallSound() {
        if(waterfallSound != null) {
            waterfallSound.pause();
            playWaterfall.setImageResource(R.drawable.waterfalloff);
        }
    }

    @Override
    protected void onDestroy() {
        if(nightSound != null && nightSound.isPlaying()) {
            nightSound.stop();
            nightSound.release();
            nightSound = null;
        }
        if(lightWindSound != null && lightWindSound.isPlaying()) {
            lightWindSound.stop();
            lightWindSound.release();
            lightWindSound = null;
        }
        if(heavyWindSound != null && heavyWindSound.isPlaying()) {
            heavyWindSound.stop();
            heavyWindSound.release();
            heavyWindSound = null;
        }
        if(lightRainSound != null && lightRainSound.isPlaying()) {
            lightRainSound.stop();
            lightRainSound.release();
            lightRainSound = null;
        }
        if(mediumRainSound != null && mediumRainSound.isPlaying()) {
            mediumRainSound.stop();
            mediumRainSound.release();
            mediumRainSound = null;
        }
        if(heavyRainSound != null && heavyRainSound.isPlaying()) {
            heavyRainSound.stop();
            heavyRainSound.release();
            heavyRainSound = null;
        }
        if(thunderSound != null && thunderSound.isPlaying()) {
            thunderSound.stop();
            thunderSound.release();
            thunderSound = null;
        }
        if(forestSound != null && forestSound.isPlaying()) {
            forestSound.stop();
            forestSound.release();
            forestSound = null;
        }
        if(birdsSound != null && birdsSound.isPlaying()) {
            birdsSound.stop();
            birdsSound.release();
            birdsSound = null;
        }
        if(citiesSound != null && citiesSound.isPlaying()) {
            citiesSound.stop();
            citiesSound.release();
            citiesSound = null;
        }
        if(carsSound != null && carsSound.isPlaying()) {
            carsSound.stop();
            carsSound.release();
            carsSound = null;
        }
        if(fireplaceSound != null && fireplaceSound.isPlaying()) {
            fireplaceSound.stop();
            fireplaceSound.release();
            fireplaceSound = null;
        }
        if(snowStormSound != null && snowStormSound.isPlaying()) {
            snowStormSound.stop();
            snowStormSound.release();
            snowStormSound = null;
        }
        if(oceanSound != null && oceanSound.isPlaying()) {
            oceanSound.stop();
            oceanSound.release();
            oceanSound = null;
        }
        if(riverSound != null && riverSound.isPlaying()) {
            riverSound.stop();
            riverSound.release();
            riverSound = null;
        }
        if(waterfallSound != null && waterfallSound.isPlaying()) {
            waterfallSound.stop();
            waterfallSound.release();
            waterfallSound = null;
        }

        super.onDestroy();
    }
}
