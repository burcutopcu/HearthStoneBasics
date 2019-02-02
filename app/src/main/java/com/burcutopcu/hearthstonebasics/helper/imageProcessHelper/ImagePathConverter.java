package com.burcutopcu.hearthstonebasics.helper.imageProcessHelper;


public class ImagePathConverter {

    /**
     * This method provide converted image path
     * From Http to Https
     *
     * @param imagePath
     * @return image path as String
     * @author burcutopcu
     * @since 1.0
     */
    String convertHttpToHttps(String imagePath) {

        if (imagePath != null && !imagePath.startsWith("https") && imagePath.contains("http")) {
            return imagePath.replace("http", "https");
        }

        return imagePath;
    }

}
