package com.codingapi.txlcn.tc.core.mode.xa;

import com.codingapi.txlcn.common.util.Transactions;
import com.codingapi.txlcn.tc.core.context.TransactionModeProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * Description:
 * Date: 19-2-28 下午1:48
 *
 * @author ujued
 */
@Component
public class XaModeProperties implements TransactionModeProperties {

    @Override
    public Properties provide() {
        Properties properties = new Properties();
        properties.setProperty(Transactions.TXC + ".connection.proxy", "false");
        return properties;
    }
}