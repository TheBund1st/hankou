package contracts.dsl.campaign.winning.lottery.draw

import org.springframework.cloud.contract.spec.Contract

import static org.springframework.cloud.contract.spec.internal.HttpMethods.HttpMethod.POST

Contract.make {
    description "POST to draw lottery"
    request {
        urlPath "/winning/lottery/draw"
        method POST
        headers {
            contentType applicationJson()
        }
        body([
                campaign: value(consumer(regex('.*')), producer('1')),
                customer: value(consumer(regex('.*')), producer('lucky guy'))
        ])
    }
    response {
        status 200
        body([
                won   : true,
                reward: [
                        item    : 'a reward item identity',
                        quantity: 1
                ]
        ])
    }
}