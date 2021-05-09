package ai.elimu.model.v1.gson.content.multimedia;

import ai.elimu.model.enums.content.AudioFormat;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public class AudioGson extends MultimediaGson {
    
    private String transcription;
    
    private Long durationMs;
    
    private AudioFormat audioFormat;

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }
    
    public Long getDurationMs() {
        return durationMs;
    }
    
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioType(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }
}
