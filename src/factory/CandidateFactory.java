/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import constants.CandidateType;
import dto.CandidateDTO;
import model.Candidate;
import utils.CandidateException;

/**
 *
 * @author nguye
 */
public class CandidateFactory {

    private static final String PACKAGE = "factory";

    public static Candidate factoryCandidate(CandidateDTO dto) {
        try {
            String type = dto.getCandidateType().toString();

            String className = PACKAGE + "." + capitalize(type) + "CandidateCreator";

            Class<?> clazz = Class.forName(className);
            CandidateCreator creator = (CandidateCreator) clazz.getDeclaredConstructor().newInstance();
            return creator.createCandidate(dto);
        } catch (Exception e) {
            throw new CandidateException(constants.Message.ERR_CANDIDATE_TYPE);
        }
    }

    //Convert a word with format
    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            throw new CandidateException("");
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
