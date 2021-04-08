package com.powerrich.front.mq.impl.base;

import java.io.Serializable;


public class NodeInfo
        implements Serializable {
    private static final long serialVersionUID = -2332993913289158565L;
    private String mqHost = "";

    private String mqPort = "";

    private String nodeName = "";

    private NodeInfo parentNode = null;

    private NodeInfo nextNode = null;


    public NodeInfo(String host, String port, String nodename, NodeInfo next, NodeInfo pNode) {
        this.mqHost = host;
        this.mqPort = port;
        this.nodeName = nodename;
        this.nextNode = next;
        this.parentNode = pNode;
    }


    public String getMqHost() {
        return this.mqHost;
    }


    public String getMqPort() {
        return this.mqPort;
    }


    public String getNodeName() {
        return this.nodeName;
    }


    public NodeInfo getNextNode() {
        return this.nextNode;
    }


    public NodeInfo getParentNode() {
        return this.parentNode;
    }


    public void setNextNode(NodeInfo value) {
        this.nextNode = value;
    }


    public void setParentNode(NodeInfo value) {
        this.parentNode = value;
    }
}


