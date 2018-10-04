
package com.example.test.screens.starcharacterdetails.mvvm.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class StarCharacter$$Parcelable
    implements Parcelable, ParcelWrapper<com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter>
{

    private com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter starCharacter$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<StarCharacter$$Parcelable>CREATOR = new Creator<StarCharacter$$Parcelable>() {


        @Override
        public StarCharacter$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new StarCharacter$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public StarCharacter$$Parcelable[] newArray(int size) {
            return new StarCharacter$$Parcelable[size] ;
        }

    }
    ;

    public StarCharacter$$Parcelable(com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter starCharacter$$2) {
        starCharacter$$0 = starCharacter$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(starCharacter$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter starCharacter$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(starCharacter$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(starCharacter$$1));
            parcel$$1 .writeString(starCharacter$$1 .getBirthYear());
            parcel$$1 .writeString(starCharacter$$1 .getCreated());
            parcel$$1 .writeString(starCharacter$$1 .getMass());
            parcel$$1 .writeString(starCharacter$$1 .getName());
            parcel$$1 .writeString(starCharacter$$1 .getHeight());
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter getParcel() {
        return starCharacter$$0;
    }

    public static com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter starCharacter$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            starCharacter$$4 = new com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter();
            identityMap$$1 .put(reservation$$0, starCharacter$$4);
            starCharacter$$4 .setBirthYear(parcel$$3 .readString());
            starCharacter$$4 .setCreated(parcel$$3 .readString());
            starCharacter$$4 .setMass(parcel$$3 .readString());
            starCharacter$$4 .setName(parcel$$3 .readString());
            starCharacter$$4 .setHeight(parcel$$3 .readString());
            com.example.test.screens.starcharacterdetails.mvvm.models.StarCharacter starCharacter$$3 = starCharacter$$4;
            identityMap$$1 .put(identity$$1, starCharacter$$3);
            return starCharacter$$3;
        }
    }

}
