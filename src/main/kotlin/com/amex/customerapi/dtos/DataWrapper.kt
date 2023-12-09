package com.amex.customerapi.dtos

class DataWrapper <T>{
    private var _message : String ?=null
    private var _payload : T ? = null
    var msg : String ?=null
    var pload : T ?=null
    constructor(message : String ?) : super() {
        this._message = message
        msg = message
    }
    constructor(payload : T)  : super() {
        this._payload = payload
        pload = _payload
    }
}