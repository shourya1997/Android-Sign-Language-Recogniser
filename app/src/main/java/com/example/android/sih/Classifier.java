package com.example.android.sih;

import android.graphics.Bitmap;
import android.graphics.RectF;

import java.util.List;

/**
 * Created by sengu on 30-Mar-18.
 */
public interface Classifier {

    // A result returned by Classifier indicating what was recognized

    public class Recognition{
        // A unique identifer for what has been recognized. Specific to the class
        private final String id;

        // Name of recognised text
        private final String title;

        // Score of what is recognised
        private final Float confidence;

        // localisation of the object from the source image
        private RectF location;

        public Recognition(final String id,
                           final String title,
                           final Float confidence,
                           final RectF location){
            this.id = id;
            this.title = title;
            this.confidence = confidence;
            this.location = location;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public Float getConfidence() {
            return confidence;
        }

        public RectF getLocation() {
            return new RectF(location);
        }

        public void setLocation(RectF location) {
            this.location = location;
        }

        @Override
        public String toString() {
            String resultString = "";
            if (id != null) {
                resultString += "[" + id + "] ";
            }

            if (title != null) {
                resultString += title + " ";
            }

            if (confidence != null) {
                resultString += String.format("(%.1f%%) ", confidence * 100.0f);
            }

            if (location != null) {
                resultString += location + " ";
            }

            return resultString.trim();

        }
    }

    List<Recognition> recognizeImage(Bitmap bitmap);

    void enableStatLogging(final boolean debug);

    String getStatString();

    void close();
}

