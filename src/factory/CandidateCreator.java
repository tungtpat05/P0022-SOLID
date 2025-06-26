/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import dto.CandidateDTO;
import model.Candidate;

/**
 *
 * @author nguye
 */
public interface CandidateCreator {
    public abstract Candidate createCandidate(CandidateDTO candidateDTO);
}
