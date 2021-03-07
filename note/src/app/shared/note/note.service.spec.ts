import { TestBed } from '@angular/core/testing';

import { NoteService } from './note.service';
import {Injectable} from "@angular/core";

@Injectable()
export class NoteService {
  public API = '//localhost:8888';
  public NOTE_API = this.API + '/note';
}

describe('NoteService', () => {
  let service: NoteService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NoteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
