
package com.chaoqi.springboot_test.dao.domain;

public class MusicInfo {
    // 主键id
    private Integer id;

    // 歌手名
    private String singerName;

    // 歌曲大小
    private String musicSize;

    // 歌曲名
    private String musicName;

    /**
     * 获取 主键id music_info.id
     *
     * @return 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键id music_info.id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 歌手名 music_info.singer_name
     *
     * @return 歌手名
     */
    public String getSingerName() {
        return singerName;
    }

    /**
     * 设置 歌手名 music_info.singer_name
     *
     * @param singerName 歌手名
     */
    public void setSingerName(String singerName) {
        this.singerName = singerName == null ? null : singerName.trim();
    }

    /**
     * 获取 歌曲大小 music_info.music_size
     *
     * @return 歌曲大小
     */
    public String getMusicSize() {
        return musicSize;
    }

    /**
     * 设置 歌曲大小 music_info.music_size
     *
     * @param musicSize 歌曲大小
     */
    public void setMusicSize(String musicSize) {
        this.musicSize = musicSize == null ? null : musicSize.trim();
    }

    /**
     * 获取 歌曲名 music_info.music_name
     *
     * @return 歌曲名
     */
    public String getMusicName() {
        return musicName;
    }

    /**
     * 设置 歌曲名 music_info.music_name
     *
     * @param musicName 歌曲名
     */
    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "id=" + id +
                ", singerName='" + singerName + '\'' +
                ", musicSize='" + musicSize + '\'' +
                ", musicName='" + musicName + '\'' +
                '}';
    }
}