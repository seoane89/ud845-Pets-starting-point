package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    //Content Authority
    public static final String CONTENT_AUTHORITIY = "com.example.android.pets";
    //Base content Url
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITIY);
    //Pets table path
    public static final String PATH_PETS = "pets";

    public static abstract class PetEntry implements BaseColumns{

        // Usng withAppendedPath() method we add the path to the base content Uri to create the complete content Uri
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        // Possible values for Pet Gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         */
        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }

    }
    // Prevents the PetsContract class from being instantiated.
    private PetContract() {}

}
