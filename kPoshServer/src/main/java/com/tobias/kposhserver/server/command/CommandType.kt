package com.tobias.kposhserver.server.command

enum class CommandType {
    RESPONSE_POWERSHELL,
    RESPONSE_AGENT,
    CALL_POWERSHELL,
    CALL_AGENT,
    UNKNOWN
}