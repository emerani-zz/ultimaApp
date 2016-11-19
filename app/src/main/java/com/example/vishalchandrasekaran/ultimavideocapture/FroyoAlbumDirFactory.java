package com.example.vishalchandrasekaran.ultimavideocapture;

import android.os.Environment;

import java.io.File;

/**
 * Created by vishalchandrasekaran on 11/19/16.
 */
public final class FroyoAlbumDirFactory extends AlbumStorageDirFactory {

    @Override
    public File getAlbumStorageDir(String albumName) {
        // TODO Auto-generated method stub
        return new File(
                Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_PICTURES
                ),
                albumName
        );
    }
}