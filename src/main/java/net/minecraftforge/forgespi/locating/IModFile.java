package net.minecraftforge.forgespi.locating;

import net.minecraftforge.forgespi.language.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public interface IModFile {
    IModLanguageProvider getLoader();

    Path findResource(String className);

    Supplier<Map<String,Object>> getSubstitutionMap();

    Type getType();

    Path getFilePath();

    List<IModInfo> getModInfos();

    ModFileScanData getScanResult();

    String getFileName();

    IModLocator getLocator();

    IModFileInfo getModFileInfo();

    enum Type {
        MOD, LIBRARY, LANGPROVIDER
    }
}
