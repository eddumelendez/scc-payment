import org.springframework.cloud.contract.spec.Contract

Contract.make {
    label "payment_failed"
    input {
        triggeredBy "makePaymentFails()"
    }
    outputMessage {
        sentTo "payments"
        body(
                uuid: "d64c361b-29bb-43a9-8fe8-5e7e05493842",
                status: "FAILED"
        )
        headers {
            header("contentType", applicationJson())
        }
    }
}
