import { BaseEntity } from './../../shared';

export const enum VoucherDateType {
    'DONE',
    'BOOK',
    'VALUE',
    'TRANSACTION'
}

export class VoucherValuation implements BaseEntity {
    constructor(
        public id?: number,
        public amount?: number,
        public currencyIso?: string,
        public amountBaseCurrency?: number,
        public dateType?: VoucherDateType,
        public globalSequenceNumber?: number,
        public businessUseCase?: string,
        public positionKeepingId?: string,
        public legalEntityId?: string,
        public journalPostingId?: number,
        public positionId?: number,
        public valuationTypeId?: number,
    ) {
    }
}
