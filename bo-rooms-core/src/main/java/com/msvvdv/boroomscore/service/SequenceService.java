package com.msvvdv.boroomscore.service;

public interface SequenceService {
    long getNextSequenceId(String key) throws SecurityException;
}
