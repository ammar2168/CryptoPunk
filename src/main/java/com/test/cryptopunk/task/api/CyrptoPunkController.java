package com.test.cryptopunk.task.api;

import com.test.cryptopunk.task.entity.CryptoPunk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cryptopunk")
public class CyrptoPunkController {

    @GetMapping("/punks/sale")
    public List<CryptoPunk> getPunksForSale(){
        return null;
    }
}

// org.web3j.codegen.SolidityFunctionWrapperGenerator -b ./CryptoPunksMarket.bin -a ./CryptoPunksMarket.abi -o java -p bin1