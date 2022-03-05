package Launcher;

import java.io.IOException;

public class Launcher {
    private String javaPath; //java路径
    private String maxMemory; //最大分配内存
    private String nativeFilePath; //native文件路径
    private String minecraftLibAndMainClassPath; //库以及主路径
    private String launcherNameAndVersion; //启动器名称和版本
    private String gameLogConfigFilePath; //日志配置文件路径
    private String mcUserName; //用户名
    private String mcVersion; //版本
    private String gameDir; //游戏路径
    private String assetsDir; //资源文件路径
    private String assetIndex; //资源索引版本
    private String uuid; //用户uuid
    private String accessToken; //后接登录令牌
    private String userType; //用户类型
    private String versionType; //版本类型
    private String systemName;
    private String systemVersion;


    private  Launcher(){}

    public static Launcher createLauncher(){
        Launcher launcher = new Launcher();
        return  launcher;
    }
    public static Launcher createLauncher(String javaPath, String maxMemory, String nativeFilePath, String minecraftLibAndMainClassPath, String launcherNameAndVersion, String gameLogConfigFilePath, String mcUserName, String mcVersion, String gameDir, String assetsDir, String assetIndex, String uuid, String accessToken, String userType, String versionTypem,String systemName,String systemVersion,String versionType){
        Launcher launcher = new Launcher();

        launcher.setAccessToken(accessToken);
        launcher.setLauncherNameAndVersion(launcherNameAndVersion);
        launcher.setMcVersion(mcVersion);
        launcher.setAssetIndex(assetIndex);
        launcher.setAssetsDir(assetsDir);
        launcher.setGameDir(assetsDir);
        launcher.setGameLogConfigFilePath(gameLogConfigFilePath);
        launcher.setJavaPath(javaPath);
        launcher.setMaxMemory(maxMemory);
        launcher.setMcUserName(mcUserName);
        launcher.setMinecraftLibAndMainClassPath(minecraftLibAndMainClassPath);
        launcher.setLauncherNameAndVersion(launcherNameAndVersion);
        launcher.setNativeFilePath(nativeFilePath);
        launcher.setUserType(userType);
        launcher.setUuid(uuid);
        launcher.setVersionType(versionType);
        launcher.setSystemName(systemName);
        launcher.setSystemVersion(systemVersion);

        return  launcher;
    }

    public void launch(){
        try {
            Runtime.getRuntime().exec("\""+getJavaPath()+"\" -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump \"-Dos.name="+getSystemName()+"\" -Dos.version="+getSystemVersion()+" -Xss1M -Djava.library.path="+getNativeFilePath()+" -Dminecraft.launcher.brand=minecraft-launcher -Dminecraft.launcher.version=1.0 "+getMinecraftLibAndMainClassPath()+" -Xmx"+getMaxMemory()+" -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M -Dlog4j.configurationFile="+getGameLogConfigFilePath()+" net.minecraft.client.main.Main --username "+getMcUserName()+" --version "+getMcVersion()+" --gameDir "+getGameDir()+" --assetsDir "+getAssetsDir()+" --assetIndex "+getAssetIndex()+" --uuid "+getUuid()+" --accessToken "+getAccessToken()+" --userType "+getUserType()+" --versionType "+getVersionType());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setJavaPath(String value){ this.javaPath = value; }
    public void setMaxMemory(String value){ this.maxMemory = value; }
    public void setNativeFilePath(String v){ this.nativeFilePath = v; }
    public void setMinecraftLibAndMainClassPath(String v){ this.minecraftLibAndMainClassPath = v; }
    public void setLauncherNameAndVersion(String v){ this.launcherNameAndVersion = v; }
    public void setGameLogConfigFilePath(String v){ this.gameLogConfigFilePath = v; }
    public void setMcUserName(String v){ this.mcUserName = v; }
    public void setMcVersion(String v){ this.mcVersion = v; }
    public void setGameDir(String v){ this.gameDir = v; }
    public void setAssetsDir(String v){ this.assetsDir = v; }
    public void setAssetIndex(String v){ this.assetIndex = v; }
    public void setUuid(String v){ this.uuid = v; }
    public void setAccessToken(String v){ this.accessToken = v; }
    public void setUserType(String v){ this.userType = v; }
    public void setVersionType(String v){ this.versionType = v; }
    public void setSystemName(String v){ this.systemName = v; }
    public void setSystemVersion(String v){ this.systemVersion = v; }

    public String getJavaPath(){return this.javaPath;}
    public String getMaxMemory(){return this.maxMemory;}
    public String getNativeFilePath(){return this.nativeFilePath;}
    public String getMinecraftLibAndMainClassPath(){return this.minecraftLibAndMainClassPath;}
    public String getLauncherNameAndVersion(){return this.launcherNameAndVersion;}
    public String getGameLogConfigFilePath(){return this.gameLogConfigFilePath;}
    public String getMcUserName(){return this.mcUserName;}
    public String getMcVersion(){return this.mcVersion;}
    public String getGameDir(){return this.gameDir;}
    public String getAssetsDir(){return this.assetsDir;}
    public String getAssetIndex(){return this.assetIndex;}
    public String getUuid(){return this.uuid;}
    public String getAccessToken(){return this.accessToken;}
    public String getUserType(){return this.userType;}
    public String getVersionType(){return this.versionType;}
    public String getSystemName(){return systemName;}
    public String getSystemVersion(){return systemVersion;}
}
