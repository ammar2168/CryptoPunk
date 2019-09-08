package com.test.cryptopunk.task.service;

import com.test.cryptopunk.task.contract.bin3.CryptoPunksMarket;
import com.test.cryptopunk.task.entity.CryptoPunk;
import com.test.cryptopunk.task.entity.CyrptoPunkInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

@Service
public class CryptoPunkServiceImpl implements CyrptoPunkService {

    private final static Logger logger = LoggerFactory.getLogger(CryptoPunkServiceImpl.class);

    private Web3j web3;

/*    @Value("${contract.address}")
    private String contractAddress;

    @Value("${cryptopunks.market.abi}")
    private String cryptopunksMarketAbi;*/

    public CryptoPunkServiceImpl(@Value("${network.uri}") String networkUri,
                                 @Value("${cryptopunks.market.abi}") String cryptopunksMarketAbi,
                                 @Value("${contract.address}") String contractAddress) throws IOException, CipherException {
        web3 = Web3j.build(new HttpService(networkUri));
        Credentials credentials = WalletUtils.loadCredentials("abcdef", "/Users/shoonya/Library/Ethereum/testnet/keystore/UTC--2019-09-08T08-00-41.607000000Z--141a67f7e415ff5ac159f5f3f70d573ea3a01de9.json");
        CryptoPunksMarket contract = CryptoPunksMarket.load(contractAddress, web3, credentials, new DefaultGasProvider());
        logger.info("Contract is valid : " + contract.isValid());

    }

    @Override
    public List<CryptoPunk> getPunkForSale() throws IOException, CipherException {
        return null;
    }

    @Override
    public CyrptoPunkInfo getPunkInfo() {
        return null;
    }
}
