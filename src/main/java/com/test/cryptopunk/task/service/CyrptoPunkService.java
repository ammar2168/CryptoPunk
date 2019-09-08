package com.test.cryptopunk.task.service;

import com.test.cryptopunk.task.entity.CryptoPunk;
import com.test.cryptopunk.task.entity.CyrptoPunkInfo;
import org.web3j.crypto.CipherException;

import java.io.IOException;
import java.util.List;

public interface CyrptoPunkService {

    List<CryptoPunk> getPunkForSale() throws IOException, CipherException;

    CyrptoPunkInfo getPunkInfo();

}
