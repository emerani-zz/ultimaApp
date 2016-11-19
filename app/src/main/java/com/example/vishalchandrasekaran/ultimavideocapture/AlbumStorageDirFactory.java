package com.example.vishalchandrasekaran.ultimavideocapture;

import java.io.File;

/**
 * Created by vishalchandrasekaran on 11/19/16.
 */
public abstract class AlbumStorageDirFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
